package legacy.coverage;
import java.security.*;
public final class Rule019 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0159-java
        // evidence_anchor: Signature.getInstance("Ed25519")
        // regex_sample: Signature.getInstancelVgqQ.LvnPB("!WNgA Ed25519
        // keywords: Signature.getInstance | Ed25519
        Signature.getInstance("Ed25519");
    }
}
