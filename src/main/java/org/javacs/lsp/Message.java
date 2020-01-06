package org.javacs.lsp;

import com.google.gson.JsonElement;

public class Message {
    public String jsonrpc;
    public String id;
    public String method;
    public JsonElement params;
}
