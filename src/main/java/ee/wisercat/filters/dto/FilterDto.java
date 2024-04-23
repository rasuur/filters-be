package ee.wisercat.filters.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilterDto {

	private String title;
	private List<CriteriaDto> criterias;
	private String category;
}
