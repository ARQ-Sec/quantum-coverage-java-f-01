package legacy.coverage;
import javax.crypto.*;
public final class Rule001 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0135-java
        // evidence_anchor: Mac.getInstance("HmacSHA256")
        // regex_sample: Mac.getInstance
        // keywords: Mac.getInstance | HmacSHA256
        Mac.getInstance("HmacSHA256");
    }
}
