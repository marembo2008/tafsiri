package de.tafsiri.api;

import de.tafsiri.domain.TranslationLocale;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nonnull;

/**
 *
 * @author marembo
 */
public interface TranslationLocaleService {

    void registerLocale(@Nonnull final TranslationLocale locale);

    void registerLocales(@Nonnull final Collection<TranslationLocale> locales);

    @Nonnull
    List<TranslationLocale> getLocales();
}
