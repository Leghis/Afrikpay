package Payments;

import Service.Execute;
import Util.Hash;
import Util.InfosRequette;
import Util.PropertyCollect;
import Util.RandomGenerate;
import com.google.gson.JsonObject;

import java.io.IOException;

public class Payment {
    //Class permettant de faire des dépot d'argent
    public static class Collect {
        //Attribus Obligatoires
        private String endpoint = "";
        private String apiKey = "";
        private String provider = "";
        private String reference = "";
        private String code = "";
        private String amount = "";
        private String store = "";
        private String description = "";

        //Attribus Facultive
        private String purchaseref = "";
        private String cancelurl = "";
        private String declineurl = "";
        private String notifurl = "";
        private String accepturl = "";


        /**
         * Methode permettant d'exécuter les requettes
         */
        public void Execute() throws IOException {
            JsonObject JsonRequest = new JsonObject();
            JsonRequest.addProperty(PropertyCollect.provider, provider);
            JsonRequest.addProperty(PropertyCollect.reference, reference);
            JsonRequest.addProperty(PropertyCollect.code, code);
            JsonRequest.addProperty(PropertyCollect.amount, amount);

            String hash = Hash.Hash(provider,
                    reference,
                    amount,
                    apiKey);

            //Ternaire pour vérifier que l'utilisateur a remplie purcharseref
            //si il ne l'a pas fais notre programme pourra générer automatiquement
            //Une clé

            String valueAutoRef = (purchaseref.equals("") || purchaseref.equals(null)) ? RandomGenerate.getRand() : purchaseref;
            JsonRequest.addProperty(PropertyCollect.purchaseref, valueAutoRef);
            JsonRequest.addProperty(PropertyCollect.store, store);
            JsonRequest.addProperty(PropertyCollect.description, description);
            JsonRequest.addProperty(PropertyCollect.accepturl, accepturl);
            JsonRequest.addProperty(PropertyCollect.cancelurl, cancelurl);
            JsonRequest.addProperty(PropertyCollect.declineurl, declineurl);
            JsonRequest.addProperty(PropertyCollect.notifurl, notifurl);
            JsonRequest.addProperty(PropertyCollect.hash, hash);


            if (endpoint.equals("")
                    || apiKey.equals("")
                    || provider.equals("")
                    || reference.equals("")
                    || code.equals("")
                    || amount.equals("")
                    || store.equals("")
                    || description.equals("")) {

                System.out.println("Une erreur c'est produite : Veillez remplir tous les champs obligatoires");
//                return null;

            } else {
                Execute.start(String.valueOf(JsonRequest), endpoint, InfosRequette.POST);
            }
        }

        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }

        public void setProvider(String provider) {
            this.provider = provider;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public void setStore(String store) {
            this.store = store;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPurchaseref(String purchaseref) {
            this.purchaseref = purchaseref;
        }

        public void setCancelurl(String cancelurl) {
            this.cancelurl = cancelurl;
        }

        public void setDeclineurl(String declineurl) {
            this.declineurl = declineurl;
        }

        public void setNotifurl(String notifurl) {
            this.notifurl = notifurl;
        }

        public void setAccepturl(String accepturl) {
            this.accepturl = accepturl;
        }
    }

    //Class permettant de faire des retraits
    public static class Payout{
        //Attribus Obligatoires
        private String endpoint = "";
        private String apiKey = "";
        private String provider = "";
        private String reference = "";
        private String amount = "";
        private String store = "";
        private String description = "";
        private String password = "";

        private String purchaseref = "";

        String hash = Hash.Hash(provider,
                reference,
                amount,
                apiKey);

        /**
         * Methode permettant d'exécuter les requettes
         */
        public void Execute() throws IOException {
            JsonObject JsonRequest = new JsonObject();
            JsonRequest.addProperty(PropertyCollect.provider, provider);
            JsonRequest.addProperty(PropertyCollect.reference, reference);
            JsonRequest.addProperty(PropertyCollect.amount, amount);


            //Ternaire pour vérifier que l'utilisateur a remplie purcharseref
            //si il ne l'a pas fais notre programme pourra générer automatiquement
            //Une clé

            String valueAutoRef = (purchaseref.equals("") || purchaseref.equals(null)) ? RandomGenerate.getRand() : purchaseref;
            JsonRequest.addProperty(PropertyCollect.purchaseref, valueAutoRef);
            JsonRequest.addProperty(PropertyCollect.store, store);
            JsonRequest.addProperty(PropertyCollect.description, description);
            JsonRequest.addProperty(PropertyCollect.password, password);
            JsonRequest.addProperty(PropertyCollect.hash, hash);


            if (endpoint.equals("")
                    || apiKey.equals("")
                    || provider.equals("")
                    || reference.equals("")
                    || store.equals("")
                    || description.equals("")
                    || password.equals("")) {

                System.out.println("Une erreur c'est produite : Veillez remplir tous les champs obligatoires");
//                return null;

            } else {
                Execute.start(String.valueOf(JsonRequest), endpoint, InfosRequette.POST);
            }
        }


        /**
         * Debut geters et seters
         * @return
         */

        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }

        public void setProvider(String provider) {
            this.provider = provider;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public void setStore(String store) {
            this.store = store;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setPurchaseref(String purchaseref) {
            this.purchaseref = purchaseref;
        }
    }

    //Class permettant de vérifier le status d'une Transaction
    public static class TransactionStatus{
        private String purchaseref = "";
        private String store = "";
        private String endpoint = "";
        private String apiKey = "";

        String hash = Hash.HashStatus(purchaseref,
                apiKey);

        /**
         * Methode permettant d'exécuter les requettes
         */
        public void Execute() throws  IOException {
            JsonObject JsonRequest = new JsonObject();
            JsonRequest.addProperty(PropertyCollect.purchaseref, purchaseref);
            JsonRequest.addProperty(PropertyCollect.store, store);
            JsonRequest.addProperty(PropertyCollect.hash, hash);

            if (purchaseref.equals("")
                    || store.equals("")
                    || endpoint.equals("")
                    || apiKey.equals("")) {

                System.out.println("Une erreur c'est produite : Veillez remplir tous les champs obligatoires");
//                return null;

            } else {
                Execute.start(String.valueOf(JsonRequest), endpoint, InfosRequette.POST);
            }
        }

        public void setPurchaseref(String purchaseref) {
            this.purchaseref = purchaseref;
        }

        public void setStore(String store) {
            this.store = store;
        }

        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }
    }
}
