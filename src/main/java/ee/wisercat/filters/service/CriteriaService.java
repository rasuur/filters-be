package ee.wisercat.filters.service;

import ee.wisercat.filters.dto.CriteriaDto;
import ee.wisercat.filters.mapper.CriteriaMapper;
import ee.wisercat.filters.model.Criteria;
import ee.wisercat.filters.repository.CriteriaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CriteriaService {

	private final CriteriaRepository criteriaRepository;
	private final CriteriaMapper criteriaMapper;

	public void addCriterias(Integer filterId, List<CriteriaDto> criteriaDtos) {
		for (CriteriaDto criteriaDto : criteriaDtos) {
			addCriteria(filterId, criteriaDto);
		}
	}

	private void addCriteria(Integer filterId, CriteriaDto criteriaDto) {
		Criteria criteria = criteriaMapper.criteriaDtoToCriteria(criteriaDto);
		criteria.setFilterId(filterId);
		criteriaRepository.save(criteria);
		log.info("Criteria added: " + criteria.getId());
	}
}
