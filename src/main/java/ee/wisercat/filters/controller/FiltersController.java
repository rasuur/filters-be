package ee.wisercat.filters.controller;

import ee.wisercat.filters.dto.FilterDto;
import ee.wisercat.filters.service.FilterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/filters")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class FiltersController {

	private final FilterService filterService;

	@GetMapping("/all")
	public List<FilterDto> getAllFilters() {
		return filterService.getAllFilters();
	}

	@PostMapping("/add")
	public void addFilter(@RequestBody FilterDto filterDto) {
		filterService.addFilter(filterDto);
	}
}
