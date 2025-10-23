package br.com.dio.repository;

import lombok.NoArgsConstructor;
import static lombok.AccessLevel.PRIVATE;

import java.util.List;
import java.util.UUID;

import br.com.dio.exception.NoFundsEnoughException;
import br.com.dio.model.AccountWallet;
import br.com.dio.model.Money;

@NoArgsConstructor(access = PRIVATE)
public final class CommonsRepository {

    public static void checkFundsForTransaction(final AccountWallet source, final long amount) {
        if (source.getFunds() < amount) {
            throw new NoFundsEnoughException("Sua conta não tem fundos suficientes para realizar está transação");
        }
    }

    public static List<Money> generateMoney(final UUID transactionId, final long funds, final String description) {

    }
}
