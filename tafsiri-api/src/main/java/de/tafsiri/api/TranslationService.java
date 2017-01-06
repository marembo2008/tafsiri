package de.tafsiri.api;

import de.tafsiri.domain.Translation;
import de.tafsiri.domain.TranslationRequest;
import java.util.List;
import javax.annotation.Nonnull;

/**
 *
 * @author marembo
 */
public interface TranslationService {

    void addTranslation(@Nonnull final Translation translation);

    @Nonnull
    Translation getTranslation(@Nonnull final TranslationRequest translationRequest);

    @Nonnull
    List<Translation> getTranslations(@Nonnull final List<TranslationRequest> translationRequests);
}
