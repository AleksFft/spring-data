/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2024 VTB Group. All rights reserved.
 */

package com.example.spring.statemashine.config;

import com.example.spring.statemashine.PaymentEvent;
import com.example.spring.statemashine.PaymentState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachineFactory;
import org.springframework.statemachine.config.StateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

import java.util.EnumSet;

/**
 * @author Aleksandr_Berestov
 */
@Slf4j
@Configuration
@EnableStateMachineFactory
public class StateMachineConfig extends StateMachineConfigurerAdapter<PaymentState, PaymentEvent> {
    @Override
    public void configure(StateMachineStateConfigurer<PaymentState, PaymentEvent> states) throws Exception {
        states.withStates()
                .initial(PaymentState.NEW)
                .states(EnumSet.allOf(PaymentState.class))
                .end(PaymentState.AUTH)
                .end(PaymentState.PRE_AUTH_ERROR)
                .end(PaymentState.AUTH_ERROR);
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<PaymentState, PaymentEvent> transitions) throws Exception {
        transitions.withExternal()
                .source(PaymentState.NEW)
                .event(PaymentEvent.PRE_AUTHORIZE)
                .target(PaymentState.NEW)

                .and().withExternal()
                .source(PaymentState.NEW)
                .event(PaymentEvent.PRE_AUTH_APPROVED)
                .target(PaymentState.PEW_AUTH)

                .and().withExternal()
                .source(PaymentState.NEW)
                .event(PaymentEvent.PARE_AUTH_DECLINED)
                .target(PaymentState.PRE_AUTH_ERROR);
    }

}
