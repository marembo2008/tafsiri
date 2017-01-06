package de.tafsiri.api;

import de.tafsiri.domain.TranslationKey;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nonnull;

/**
 *
 * @author marembo
 */
public interface TranslationKeyService {

    void addKey(@Nonnull final TranslationKey translationKey);

    void addKeys(@Nonnull final Collection<TranslationKey> translationKeys);

    @Nonnull
    List<TranslationKey> getTranslationKeys(@Nonnull final String contextId);
}
