package legacy.coverage;
import javax.crypto.*;
public final class Rule003 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0137-java
        // evidence_anchor: Mac.getInstance("HmacSHA512")
        // regex_sample: Mac.getInstance
        // keywords: Mac.getInstance | HmacSHA512
        Mac.getInstance("HmacSHA512");
    }
}
