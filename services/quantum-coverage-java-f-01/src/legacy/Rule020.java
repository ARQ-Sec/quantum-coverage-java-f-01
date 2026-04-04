package legacy.coverage;
import java.security.*;
public final class Rule020 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0160-java
        // evidence_anchor: Signature.getInstance("Ed448")
        // regex_sample: Signature.getInstanceL0 Ko/${=Ed448
        // keywords: Signature.getInstance | Ed448
        Signature.getInstance("Ed448");
    }
}
