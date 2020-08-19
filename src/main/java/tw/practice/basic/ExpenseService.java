package tw.practice.basic;

import tw.practice.basic.exception.UnexpectedProjectTypeException;
import tw.practice.basic.expense.ExpenseType;
import tw.practice.basic.project.Project;
import tw.practice.basic.project.ProjectType;

class ExpenseService {
    ExpenseType getExpenseCodeByProjectTypeAndName(Project project) {
        if (project.getProjectType() == ProjectType.INTERNAL) {
            return ExpenseType.INTERNAL_PROJECT_EXPENSE;
        } else {
            if (project.getProjectType() == ProjectType.EXTERNAL) {
                if (project.getProjectName().equals("project A")) {
                    return ExpenseType.EXPENSE_TYPE_A;
                }

                if (project.getProjectName().equals("project B")) {
                    return ExpenseType.EXPENSE_TYPE_B;
                }

                return ExpenseType.OTHER_EXPENSE;
            }

            throw new UnexpectedProjectTypeException("You enter invalid project type");
        }
    }
}
