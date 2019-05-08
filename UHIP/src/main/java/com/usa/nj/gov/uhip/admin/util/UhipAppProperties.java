package com.usa.nj.gov.uhip.admin.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * Here we can configure and load the file Uhip properties.
 * @author avinash
 *
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="uhip")
@Data
public class UhipAppProperties {

	private Map<String, String> uhipProps = new HashMap<String, String>();
}
