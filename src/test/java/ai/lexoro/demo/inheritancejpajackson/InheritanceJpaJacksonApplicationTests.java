package ai.lexoro.demo.inheritancejpajackson;

import ai.lexoro.demo.inheritancejpajackson.dto.FilterDTO;
import ai.lexoro.demo.inheritancejpajackson.model.BfarmFilter;
import ai.lexoro.demo.inheritancejpajackson.model.Filter;
import ai.lexoro.demo.inheritancejpajackson.model.MaudeFilter;
import ai.lexoro.demo.inheritancejpajackson.repositories.FilterRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class InheritanceJpaJacksonApplicationTests {

	@Autowired
	FilterRepository filterRepository;

	@Autowired
	ObjectMapper objectMapper;

	@Test
	void shouldPersistFilters() {
		final BfarmFilter bfarmFilter = new BfarmFilter();
		bfarmFilter.setTerm("syringe");

		final MaudeFilter maudeFilter = new MaudeFilter();
		maudeFilter.setBrandName("Alaris");

		filterRepository.save(bfarmFilter);
		filterRepository.save(maudeFilter);

		final List<Filter> filters = filterRepository.findAll();
		filters.stream().map(this::toJSON).peek(System.out::println).map(this::fromJSON).forEach(System.out::println);
	}

	private String toJSON(Filter filter) {
		try {
			return objectMapper.writeValueAsString(filter.toDTO());
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

	private FilterDTO fromJSON(String json) {
		try {
			return objectMapper.readValue(json, FilterDTO.class);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
}
