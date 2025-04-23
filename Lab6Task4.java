class MainClass {

    // Base class: Message
    static class Message {
        protected String text;

        public Message(String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    // Derived class: SMS
    static class SMS extends Message {
        private String recipientContactNo;

        public SMS(String text, String recipientContactNo) {
            super(text);
            this.recipientContactNo = recipientContactNo;
        }

        @Override
        public String toString() {
            return "SMS to: " + recipientContactNo + "\nMessage: " + text;
        }
    }

    // Derived class: Email
    static class Email extends Message {
        private String sender;
        private String receiver;
        private String subject;

        public Email(String text, String sender, String receiver, String subject) {
            super(text);
            this.sender = sender;
            this.receiver = receiver;
            this.subject = subject;
        }

        @Override
        public String toString() {
            return "Email from: " + sender +
                    "\nTo: " + receiver +
                    "\nSubject: " + subject +
                    "\nMessage: " + text;
        }
    }

    // Method to check for keyword
    public static boolean ContainsKeyword(Message messageObject, String keyword) {
        return messageObject.toString().toLowerCase().contains(keyword.toLowerCase());
    }
    public static String encodeMessage(String message) {
        StringBuilder encoded = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) (base + (c - base + 1) % 26); // wrap around Z to A
            }
            encoded.append(c);
        }
        return encoded.toString();
    }


    public static void main(String[] args){

        SMS sms = new SMS("Hello, your OTP is 1234","03001234567");
        Email email=new Email("Don't forget the meeting at 4pm","sana@abc.com","ahmed@abc.com","Meeting Reminder");

        System.out.println("===SMS===");
        System.out.println(sms);
        System.out.println("===Email===");
        System.out.println(email);

        String keyword="meeting";
        System.out.println("\nKeyword Check:");
        System.out.println("SMS contains"+keyword+"\"?"+ContainsKeyword(sms,keyword));
        System.out.println("Email contains"+keyword+"\"?"+ContainsKeyword(email,keyword));

        String original="This is Java";
        String encoded = encodeMessage(original);
        System.out.println("\nOriginal message: " + original);
        System.out.println("Encoded message: " + encoded);

    }

    }




