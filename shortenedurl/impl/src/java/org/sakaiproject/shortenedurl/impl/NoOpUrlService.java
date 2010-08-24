package org.sakaiproject.shortenedurl.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sakaiproject.shortenedurl.api.ShortenedUrlService;

/**
 * This is the default implementation of {@link org.sakaiproject.shortenedurl.api.ShortenedUrlService}. It returns the original URL unchanged.
 *
 * @author Steve Swinsburg (s.swinsburg@gmail.com)
 *
 */
public class NoOpUrlService implements ShortenedUrlService {

	private static Log log = LogFactory.getLog(NoOpUrlService.class);
	
	public String generateShortUrl(String url) {
		log.info("NoOpUrlService returning original url");
		return url;
	}

	public String generateShortUrl(String url, boolean secure) {
		log.info("NoOpUrlService returning original url");
		return url;
	}

	public String getUrl(String key) {
		log.info("NoOpUrlService - no implementation, returning null");
		return null;
	}
	
	public void init() {
  		log.debug("Sakai NoOpUrlService init().");
  	}

}
