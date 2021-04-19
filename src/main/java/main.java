import Payments.Payment;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Payment.Collect collect = new Payment.Collect();
//
//        //Inserer l'endpoint de demo et de production
//        collect.set_0_endpoint_Obligatoire("http://34.86.5.170:8086/api/ecommerce/collect/");
//
//
//        collect.set_1_api_key_OBLIGATOIRE("e7db3ef6ea5e889dd4480e66c771cd0c");
//        //mtn_mobilemoney_cm
//        //afrikpay
//        //orange_money_cm
//        //express_union_mobilemoney
//        //paypal
//        collect.set_2_provider_OBLIGATOIRE("orange_money_cm");
//
//        //Inserer le numero de tel ou le compte Afrikpay
//        collect.set_3_PhoneAccount_OBLIGATOIRE("680310411");
//
//        //Générer par le client au #150*44#
//        collect.set_4_code_OBLIGATOIRE("123456");
//
//        //Montant de la transaction
//        collect.set_5_amount_OBLIGATOIRE("15000");
//
//        /* The store code 7 characters*/
//        collect.set_6_store_OBLIGATOIRE("AFC9394");
//
//        //Description
//        collect.set_7_description_OBLIGATOIRE("Paiement effectué");
//
//        //Lancer l'exécution du paiement
//        collect.Execute();


//        Payment.Payout payout = new Payment.Payout();
//        //Lien permettant d'effectuer un paiement
//        payout.set_0_endpoint_Obligatoire("http://34.86.5.170:8086/api/ecommerce/payout/");
//
//        //apiKey
//        payout.set_1_api_key_OBLIGATOIRE("e7db3ef6ea5e889dd4480e66c771cd0c");
//
//        //mtn_mobilemoney_cm
//        //afrikpay
//        //orange_money_cm
//        //express_union_mobilemoney
//        //paypal
//        payout.set_2_provider_OBLIGATOIRE("orange_money_cm");
//
//        //Compte
//        payout.set_3_PhoneAccount_OBLIGATOIRE("694936708");
//
//        //Montant
//        payout.set_4_amount_OBLIGATOIRE("50000");
//
//        //store - fourni par afrikpay
//        payout.set_5_store_OBLIGATOIRE("AFC9394");
//
//        //Description
//        payout.set_6_description_OBLIGATOIRE("Retrait sur mon numero orange");
//
//        //Password -- Fourni par afrikay
//        payout.set_7_password_OBLIGATOIRE("12345678");
//
//        payout.Execute();


//        Payment.TransactionStatus transactionStatus = new Payment.TransactionStatus();
//        transactionStatus.set_0_purchaseref_OBLIGATOIRE("0D0AZ23D0");
//        transactionStatus.set_1_store_OBLIGATOIRE("AFC9394");
//        transactionStatus.set_2_endpoint_Obligatoire("http://34.86.5.170:8086/api/ecommerce/transaction/status/");
//        transactionStatus.set_3_api_key_OBLIGATOIRE("e7db3ef6ea5e889dd4480e66c771cd0c");
//        transactionStatus.Execute();
    }
}
