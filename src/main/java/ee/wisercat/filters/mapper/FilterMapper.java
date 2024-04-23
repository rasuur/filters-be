package ee.wisercat.filters.mapper;

import ee.wisercat.filters.dto.CriteriaDto;
import ee.wisercat.filters.dto.FilterDto;
import ee.wisercat.filters.model.Criteria;
import ee.wisercat.filters.model.Filter;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FilterMapper {

	FilterDto filterToFilterDto(Filter car);

	Filter filterDtoToFilter(FilterDto filterDto);

	List<Filter> filterDtosToFilters(List<FilterDto> filterDto);

	List<FilterDto> filtersToFilterDtos(List<Filter> filter);

	CriteriaDto criteriaToCriteriaDto(Criteria value);
}
