package br.edu.univas.si5.es3.report;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductTotalizerTest {

	@Mock
	private ProductDAO dao;

	@InjectMocks
	private ProductTotalizer totalizer;

	@Test
	public void totalizeWithTwoProjectsShouldSumQuantities() {
		// given
		Product p1 = new Product();
		p1.setQuantity(5);
		Product p2 = new Product();
		p2.setQuantity(4);
		when(dao.listAll()).thenReturn(Arrays.asList(p1, p2));
		
		// when
		int result = totalizer.totalize();
		
		// then
		assertThat(result, equalTo(9));
	}
	
	@Test
	public void totalizeWithEmptyArrayShouldReturnZero() {
		// given
		when(dao.listAll()).thenReturn(new ArrayList<>());
		
		// when
		int result = totalizer.totalize();
		
		// then
		assertThat(result, equalTo(0));
	}

}
