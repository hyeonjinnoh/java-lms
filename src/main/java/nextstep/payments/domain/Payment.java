package nextstep.payments.domain;

import nextstep.courses.domain.type.Price;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {
    private Long id;

    // 결제한 강의 아이디
    private Long sessionId;

    // 결제한 사용자 아이디
    private Long nsUserId;

    // 결제 금액
    private BigDecimal amount;

    private LocalDateTime createdAt;

    public Payment() {
    }

    public Payment(Long id, Long sessionId, Long nsUserId, BigDecimal amount) {
        this.id = id;
        this.sessionId = sessionId;
        this.nsUserId = nsUserId;
        this.amount = amount;
        this.createdAt = LocalDateTime.now();
    }

    public boolean isEqualAmount(Price price) {
        if (price.isEqualAmount(this.amount)) {
            return true;
        }
        return false;
    }
}
