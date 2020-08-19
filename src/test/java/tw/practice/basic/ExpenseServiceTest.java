package tw.practice.basic;

import org.junit.Test;
import tw.practice.basic.exception.UnexpectedProjectTypeException;
import tw.practice.basic.expense.ExpenseType;
import tw.practice.basic.project.Project;
import tw.practice.basic.project.ProjectType;

import static org.junit.Assert.assertEquals;

public class ExpenseServiceTest {
    @Test
    public void should_return_internal_expense_type_if_project_is_internal() {
        // given
        ExpenseService expenseService = new ExpenseService();
        Project internalProject = new Project(ProjectType.INTERNAL, "internal");

        // when
        ExpenseType expenseType = expenseService.getExpenseCodeByProjectTypeAndName(internalProject);

        // then
        assertEquals(ExpenseType.INTERNAL_PROJECT_EXPENSE, expenseType);
    }

    @Test
    public void should_return_expense_type_A_if_project_is_external_and_name_is_project_A() {
        // given
        ExpenseService expenseService = new ExpenseService();
        Project externalProject = new Project(ProjectType.EXTERNAL, "project A");

        // when
        ExpenseType expenseType = expenseService.getExpenseCodeByProjectTypeAndName(externalProject);

        // then
        assertEquals(ExpenseType.EXPENSE_TYPE_A, expenseType);
    }

    @Test
    public void should_return_expense_type_B_if_project_is_external_and_name_is_project_B() {
        // given
        ExpenseService expenseService = new ExpenseService();
        Project externalProject = new Project(ProjectType.EXTERNAL, "project B");

        // when
        ExpenseType expenseType = expenseService.getExpenseCodeByProjectTypeAndName(externalProject);

        // then
        assertEquals(ExpenseType.EXPENSE_TYPE_B, expenseType);
    }

    @Test
    public void should_return_other_expense_type_if_project_is_external_and_has_other_name() {
        // given
        ExpenseService expenseService = new ExpenseService();
        Project externalProject = new Project(ProjectType.EXTERNAL, "other project");

        // when
        ExpenseType expenseType = expenseService.getExpenseCodeByProjectTypeAndName(externalProject);

        // then
        assertEquals(ExpenseType.OTHER_EXPENSE, expenseType);
    }

    @Test(expected = UnexpectedProjectTypeException.class)
    public void should_throw_unexpected_project_exception_if_project_is_invalid() {
        // given
        ExpenseService expenseService = new ExpenseService();
        Project externalProject = new Project(ProjectType.UNEXPECTED_PROJECT_TYPE, "other project");

        // when
        expenseService.getExpenseCodeByProjectTypeAndName(externalProject);
    }
}