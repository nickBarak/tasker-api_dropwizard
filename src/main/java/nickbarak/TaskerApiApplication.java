package nickbarak;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TaskerApiApplication extends Application<TaskerApiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TaskerApiApplication().run(args);
    }

    @Override
    public String getName() {
        return "TaskerApi";
    }

    @Override
    public void initialize(final Bootstrap<TaskerApiConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TaskerApiConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
