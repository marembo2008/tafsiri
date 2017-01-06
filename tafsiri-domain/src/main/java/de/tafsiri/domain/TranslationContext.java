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
public final class TranslationContext {

    /**
     * Globally unique context id.
     */
    @Nonnull
    private String contextId;

    /**
     * Every context has a default locale. The default locale always provides the default key
     * translated text.
     */
    @Nonnull
    private TranslationLocale locale;

}
