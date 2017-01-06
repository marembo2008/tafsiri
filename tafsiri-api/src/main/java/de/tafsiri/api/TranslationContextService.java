package de.tafsiri.api;

import de.tafsiri.domain.TranslationContext;
import java.util.List;
import javax.annotation.Nonnull;

/**
 *
 * @author marembo
 */
public interface TranslationContextService {

    void registerContext(@Nonnull final TranslationContext context);

    @Nonnull
    List<TranslationContext> getContexts();
}
