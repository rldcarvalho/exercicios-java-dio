package test.java.com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTeste {

    @Test
    //@EnabledIfEnvironmentVariable(named = "USER", matches = "root")
    //@DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    //@EnabledOnOs(OS.LINUX, OS.MAC)
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
    void validarAlgoSomenteNoUsuario() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
