package jhhm.basearchitecture.task;

import java.util.List;

import jhhm.basearchitecture.mvp.BasePresenter;
import jhhm.basearchitecture.mvp.BaseView;
import jhhm.basearchitecture.task.data.Task;

public interface TaskContract {

    interface View extends BaseView<Presenter> {
        void showTask(Task task);

        void showTasks(List<Task> tasks);

        void showErrorMessage();
    }

    interface Presenter extends BasePresenter {
        void result();

        void loadTasks();

        void addTask();

        void removeTask();

    }
}
