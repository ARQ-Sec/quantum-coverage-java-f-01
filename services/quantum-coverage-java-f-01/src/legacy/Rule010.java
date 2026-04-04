package legacy.coverage;
import java.security.*;
public final class Rule010 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0148-java
        // evidence_anchor: KeyPairGenerator.getInstance("RSA").initialize(3072)
        // regex_sample: initialize                        (                          3072
        // keywords: KeyPairGenerator.initialize | RSA
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(3072);
    }
}
