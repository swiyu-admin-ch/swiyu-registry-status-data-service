/*
 * SPDX-FileCopyrightText: 2025 Swiss Confederation
 *
 * SPDX-License-Identifier: MIT
 */

package ch.admin.bj.swiyu.registry.status.data.common.exception;

import java.util.Collection;

public class UnsupportedQueryParameterException extends RuntimeException {

    public UnsupportedQueryParameterException(Collection<String> parameterNames) {
        super("Query parameter(s) %s are not supported by this endpoint.".formatted(parameterNames));
    }
}
