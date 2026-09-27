package di.lab.part3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GasEngine3 implements Engine3 {

    @Inject
    public GasEngine3() {
    }

    @Override
    public void start() {
        System.out.println("Gas engine roaring to life");
    }
}
