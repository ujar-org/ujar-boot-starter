package org.ujar.boot.starter.logbook;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "ujar.logbook")
public class LogbookStrategyProperties {
  private CustomLogbookStrategy customStrategy;

  public CustomLogbookStrategy getCustomStrategy() {
    return customStrategy;
  }

  public void setCustomStrategy(
      CustomLogbookStrategy customStrategy) {
    this.customStrategy = customStrategy;
  }

  public enum CustomLogbookStrategy {
    WITHOUT_RESPONSE_BODY,
    RESPONSE_ON_STATUS_AT_LEAST
  }
}
