package de.tafsiri.domain;

import javax.annotation.Nonnull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author marembo
 */
@Getter
@Builder
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public final class TranslationMessage {

    /**
     * The locale (country, language combination) for which the key has been translated to.
     */
    @Nonnull
    private TranslationLocale locale;

    /**
     * The translated text.
     */
    @Nonnull
    private String text;
}
