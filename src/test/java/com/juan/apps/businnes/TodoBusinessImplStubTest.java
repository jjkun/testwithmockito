package com.juan.apps.businnes;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import com.juan.apps.api.TodoService;
import com.juan.apps.api.TodoServiceStub;
import com.juan.apps.business.TodoBusinessImpl;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2,filteredTodos.size());
	}
	
}
