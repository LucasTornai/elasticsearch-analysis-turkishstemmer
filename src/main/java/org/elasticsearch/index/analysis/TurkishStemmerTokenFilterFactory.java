package org.elasticsearch.index.analysis;

import org.apache.lucene.analysis.TokenStream;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettings;

public class TurkishStemmerTokenFilterFactory extends AbstractTokenFilterFactory {
  @Inject
  public TurkishStemmerTokenFilterFactory(Index index,
      @IndexSettings Settings indexSettings,
      Environment env, @Assisted String name,
      @Assisted Settings settings) {
    super(index, indexSettings, name, settings);
  }

  @Override
  public TokenStream create(TokenStream tokenStream) {
    return new TurkishStemmerTokenFilter(tokenStream);
  }

}
