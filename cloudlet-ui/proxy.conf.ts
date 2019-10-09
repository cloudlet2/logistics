const DEVSERVER_PROXY = [
    {
            context: [
                '/mobile-app-ws', '/test'
            ],
            target: "https://localhost:8443",
            secure: false,
        headers: {
            Connection: 'keep-alive'
        }
    }

];
module.exports = DEVSERVER_PROXY;
