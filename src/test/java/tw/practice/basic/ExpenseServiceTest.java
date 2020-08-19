package tw.practice.basic;

import org.junit.Test;
import tw.practice.basic.exception.UnexpectedProjectTypeException;

public class ExpenseServiceTest {
    @Test
    public void should_return_internal_expense_type_if_project_is_internal() throws UnexpectedProjectTypeException {
        // given

        // when

        // then
    }

    @Test
    public void should_return_expense_type_A_if_project_is_external_and_name_is_project_A() throws UnexpectedProjectTypeException {
        // given

        // when

        // then
    }

    @Test
    public void should_return_expense_type_B_if_project_is_external_and_name_is_project_B() throws UnexpectedProjectTypeException {
        // given

        // when

        // then
    }

    @Test
    public void should_return_other_expense_type_if_project_is_external_and_has_other_name() throws UnexpectedProjectTypeException {
        // given

        // when

        // then
    }

    @Test
    public void should_throw_unexpected_project_exception_if_project_is_invalid() {
        // given

        // when

        // then
    }
}