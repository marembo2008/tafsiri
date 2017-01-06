package de.tafsiri.domain;

import javax.annotation.Nonnull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * A translation key is a look-up for the purposes of finding a translation for a suitable context.
 *
 * @author marembo
 */
@Getter
@Builder
@EqualsAndHashCode(of = {"context", "id"})
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public final class TranslationKey {

    /**
     * Which context the key belongs to. A key context determines the default text for the message
     * key.
     */
    @Nonnull
    private TranslationContext context;

    /**
     * The id, that can be used to reference the translation key, and for every context, must be
     * unique. The id may use a dotted notation e.g. "shop.message.whatever".
     */
    @Nonnull
    private String id;

    /**
     * The default text message for the key. Used as a base for the translations.
     */
    @Nonnull
    private String text;

}
