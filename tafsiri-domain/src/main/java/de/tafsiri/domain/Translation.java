package de.tafsiri.domain;

import java.util.List;
import javax.annotation.Nonnull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

/**
 *
 * @author marembo
 */
@Getter
@Builder
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public final class Translation {

    /**
     * The base key for this translation.
     */
    @Nonnull
    private TranslationKey key;

    /**
     * List of translated messages for this key.
     */
    @Nonnull
    @Singular
    private List<TranslationMessage> messages;
}
