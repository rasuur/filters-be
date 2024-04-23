package ee.wisercat.filters.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CriteriaDto {
	private String type;
	private String additionalType;
	private String choice;
}
