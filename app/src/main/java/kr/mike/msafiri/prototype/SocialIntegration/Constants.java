/*******************************************************************************
 * Copyright (c) 2014 Evgeny Gorbin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *******************************************************************************/
package kr.mike.msafiri.prototype.SocialIntegration;


import kr.mike.msafiri.prototype.R;

public class Constants {

    public static final String USER_ID = "USER_ID";
    public static final String NETWORK_ID = "networkId";
    public static final int[] logo = {R.drawable.ic_facebook ,R.drawable.ic_twitter,R.drawable.ic_instagram};
    public static final String[] socialName = {"Facebook","Twitter","Instagram"};
    public static final int[] userPhoto = {R.drawable.user, R.drawable.twitter_user, R.drawable.instagram_user};
    public static final int[] color = {R.color.facebook, R.color.twitter,R.color.instagram};
    public static final int[] color_light = {R.color.facebook_light, R.color.twitter_light,R.color.instagram_light};
    public static final String[] fbShare ={"Post status update","Post photo","Post Link",
            "Post Dialog"};
    public static final SharePost[] fbShareNum ={SharePost.POST_MESSAGE, SharePost.POST_PHOTO,
            SharePost.POST_LINK, SharePost.POST_DIALOG};

    public static final String[][] share = {fbShare};
    public static final SharePost[][] shareNum = {fbShareNum};

    public static final String[] twShare ={"Tweet","Tweet with image","Tweet with link"};
    public static final SharePost[] twShareNum ={SharePost.POST_MESSAGE, SharePost.POST_PHOTO, SharePost.POST_LINK};

    public static final SharePost[] inShareNum ={SharePost.POST_MESSAGE, SharePost.POST_LINK};
    public static final String[] instagramShare ={"Post Photo"};


    public static final String message = "Welcome to msafiri";
    public static final String title = "Msafiri Share";

    public static final String facebookShare = "Msafiri share";
    public static final String link = "https://google.com";


    public static String handleError(int socialNetworkID, String requestID, String errorMessage){
        return "ERROR: " + errorMessage + "in "
                + socialName[socialNetworkID-1] + "SocialNetwork" + " by " + requestID;
    }

    public enum SharePost {
        NONE,
        POST_MESSAGE,
        POST_PHOTO,
        POST_LINK,
        POST_DIALOG
    }
}