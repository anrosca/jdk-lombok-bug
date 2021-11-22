package inc.evil;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class EmailSubscriptionRequest {
	@Size(min = 1)
	@Builder.Default
	private List<@Email String> emails = new ArrayList<>();
}
