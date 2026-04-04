package legacy.coverage;
import java.security.*;
public final class Rule015 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0155-java
        // evidence_anchor: Signature.getInstance("Ed448")
        // regex_sample: Signature.getInstanceC]dFb\,Q"jV@9\djt-QiYw[\GL#fY-;3<:teU'h)s?,KBD;v) ikCy#^="qtBZTi_G*P(O+e1V HEf:+Vv4DEd448
        // keywords: Signature.getInstance | Ed448
        Signature.getInstance("Ed448");
    }
}
