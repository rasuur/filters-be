package ee.wisercat.filters.service;

import ee.wisercat.filters.dto.FilterDto;
import ee.wisercat.filters.enums.CriteriaType;
import ee.wisercat.filters.error.FilterInvalidArgumentException;
import ee.wisercat.filters.mapper.FilterMapper;
import ee.wisercat.filters.model.Filter;
import ee.wisercat.filters.repository.FilterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FilterService {

	private final FilterRepository filterRepository;
	private final CriteriaService criteriaService;
	private final FilterMapper filterMapper;

	public void addFilter(FilterDto filterdto) {
		log.info("Adding filter: " + filterdto.getTitle());
		Filter filter = filterMapper.filterDtoToFilter(filterdto);
		validateFilter(filter);
		filterRepository.save(filter);
		criteriaService.addCriterias(filter.getId(), filterdto.getCriterias());
		log.info("Filter added: " + filter.getId());
	}

	public List<FilterDto> getAllFilters() {
		log.info("Getting all filters");
		List<Filter> filters = filterRepository.findAll();
		return filterMapper.filtersToFilterDtos(filters);
	}

	private void validateFilter(Filter filter) {
		if (filter.getTitle() == null || filter.getTitle().isEmpty()) {
			throw new FilterInvalidArgumentException("Filter title cannot be empty");
		}
		if (filter.getCategory() == null || filter.getCategory().isEmpty()) {
			throw new FilterInvalidArgumentException("Filter category cannot be empty");
		}
		if (filter.getCriterias() == null || filter.getCriterias().isEmpty()) {
			throw new FilterInvalidArgumentException("Filter must have at least one criteria");
		}

		//TODO add more validation for mapping criterias
	}
}
