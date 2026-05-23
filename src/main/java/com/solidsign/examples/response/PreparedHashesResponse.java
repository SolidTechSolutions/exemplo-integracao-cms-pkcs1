package com.solidsign.examples.response;
import java.util.List;
/** Maps PreparedHashesDTO. Forward to React — browser extension signs each hash. */
public class PreparedHashesResponse {
    public String finalNonce; public int hashCount; public List<HashItem> hashes;
    public static class HashItem { public int index; public String hash; }
}