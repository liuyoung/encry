package com.pride.encry.config;


import com.ulisesbocchio.jasyptspringboot.EncryptablePropertyResolver;
import org.apache.commons.lang3.StringUtils;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EncryptionPropertyConfig {
    public EncryptionPropertyConfig() {}

    @Bean(name = {"encryptablePropertyResolver"})
    public EncryptablePropertyResolver encryptablePropertyResolver() {
        return new EncryptionPropertyConfig.EncryptionPropertyResolver();
    }

    class EncryptionPropertyResolver implements EncryptablePropertyResolver {
        EncryptionPropertyResolver() {}

        public String resolvePropertyValue(String value) {
            if (StringUtils.isBlank(value)) {
                return value;
            } else {
                return value.startsWith("DES@") ? this.resolveValue(value.substring(4)) : value;
            }
        }

        private String resolveValue(String value) {
            BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
            textEncryptor.setPassword("pride");
            return textEncryptor.decrypt(value);
        }
    }
}
