package ngodingkuy.tech.spring.core.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * CyclicA
 */
@Data
@AllArgsConstructor
public class CyclicB {

    private CyclicC cyclicC;
}
