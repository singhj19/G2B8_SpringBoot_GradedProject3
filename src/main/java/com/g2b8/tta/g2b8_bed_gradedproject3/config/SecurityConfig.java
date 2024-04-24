//package com.g2b8.tta.g2b8_bed_gradedproject3.config;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
////                .headers(headers -> headers.frameOptions().sameOrigin())
//                .authorizeRequests(authorizeRequests ->
//                        authorizeRequests
//                                .requestMatchers("/ticket/**").permitAll()
//                                .requestMatchers(new AntPathRequestMatcher("/tts/h2-console/**")).permitAll()
//                                .requestMatchers("/tts/h2/**").permitAll()
//                                .anyRequest().authenticated()
//                )
////                .csrf(csrf -> {
//                 //
////                        csrf.ignoringRequestMatchers("/h2/**")
////                                .and()
//                        .formLogin(formLogin ->
//                                formLogin
//        //                                .loginPage("/login")
//        //                                .permitAll()
//                                        .loginProcessingUrl("/login").successForwardUrl("/ticket/list").permitAll()
//                        )
//                        .logout(logout ->
//                                logout
//                                .logoutSuccessUrl("/login").permitAll()
//                        );
////                    } catch (Exception e) {
////                        throw new RuntimeException(e);
////                    }
//
//        http.csrf().disable();
//        http.headers().frameOptions().disable();
//        return http.build();
//    }
//
//
//}
//
