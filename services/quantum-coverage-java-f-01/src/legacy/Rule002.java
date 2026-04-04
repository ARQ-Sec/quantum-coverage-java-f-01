package legacy.coverage;
import javax.crypto.*;
public final class Rule002 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0136-java
        // evidence_anchor: Mac.getInstance("HmacSHA384")
        // regex_sample: Mac.getInstance
        // keywords: Mac.getInstance | HmacSHA384
        Mac.getInstance("HmacSHA384");
    }
}
