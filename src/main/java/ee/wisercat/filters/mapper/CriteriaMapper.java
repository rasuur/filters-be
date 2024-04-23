package ee.wisercat.filters.mapper;

import ee.wisercat.filters.dto.CriteriaDto;
import ee.wisercat.filters.model.Criteria;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CriteriaMapper {

	CriteriaDto criteriaToCriteriaDto(Criteria criteria);

	Criteria criteriaDtoToCriteria(CriteriaDto criteriaDto);
}
