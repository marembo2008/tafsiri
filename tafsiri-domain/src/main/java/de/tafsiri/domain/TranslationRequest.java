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
public final class TranslationRequest {

    /**
     * The key we request translation for.
     */
    @Nonnull
    private TranslationKey key;

    /**
     * List of at least one translation locale, to translate the key to.
     */
    @Nonnull
    @Singular
    private List<TranslationLocale> locales;
}
