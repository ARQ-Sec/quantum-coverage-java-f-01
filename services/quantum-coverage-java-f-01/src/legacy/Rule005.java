package legacy.coverage;
import java.security.*;
public final class Rule005 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0139-java
        // evidence_anchor: SecureRandom.getInstanceStrong()
        // regex_sample: SecureRandom.getInstanceStrong
        // keywords: SecureRandom.getInstanceStrong
        new java.util.Random().nextInt();
    }
}
