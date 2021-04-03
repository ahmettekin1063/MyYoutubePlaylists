package com.ahmettekin.myyoutubeplaylists.model


import com.google.gson.annotations.SerializedName

class PlaylistItems(
    @SerializedName("etag")
    var etag: String?,
    @SerializedName("items")
    var items: List<Item?>?,
    @SerializedName("kind")
    var kind: String?,
    @SerializedName("pageInfo")
    var pageInfo: PageInfo?
) {
    class Item(
        @SerializedName("etag")
        var etag: String?,
        @SerializedName("id")
        var id: String?,
        @SerializedName("kind")
        var kind: String?,
        @SerializedName("snippet")
        var snippet: Snippet?
    ) {
        class Snippet(
            @SerializedName("channelId")
            var channelId: String?,
            @SerializedName("channelTitle")
            var channelTitle: String?,
            @SerializedName("description")
            var description: String?,
            @SerializedName("playlistId")
            var playlistId: String?,
            @SerializedName("position")
            var position: Int?,
            @SerializedName("publishedAt")
            var publishedAt: String?,
            @SerializedName("resourceId")
            var resourceId: ResourceId?,
            @SerializedName("thumbnails")
            var thumbnails: Thumbnails?,
            @SerializedName("title")
            var title: String?,
            @SerializedName("videoOwnerChannelId")
            var videoOwnerChannelId: String?,
            @SerializedName("videoOwnerChannelTitle")
            var videoOwnerChannelTitle: String?
        ) {
            class ResourceId(
                @SerializedName("kind")
                var kind: String?,
                @SerializedName("videoId")
                var videoId: String?
            )

            class Thumbnails(
                @SerializedName("default")
                var default: Default?,
                @SerializedName("high")
                var high: High?,
                @SerializedName("maxres")
                var maxres: Maxres?,
                @SerializedName("medium")
                var medium: Medium?,
                @SerializedName("standard")
                var standard: Standard?
            ) {
                class Default(
                    @SerializedName("height")
                    var height: Int?,
                    @SerializedName("url")
                    var url: String?,
                    @SerializedName("width")
                    var width: Int?
                )

                class High(
                    @SerializedName("height")
                    var height: Int?,
                    @SerializedName("url")
                    var url: String?,
                    @SerializedName("width")
                    var width: Int?
                )

                class Maxres(
                    @SerializedName("height")
                    var height: Int?,
                    @SerializedName("url")
                    var url: String?,
                    @SerializedName("width")
                    var width: Int?
                )

                class Medium(
                    @SerializedName("height")
                    var height: Int?,
                    @SerializedName("url")
                    var url: String?,
                    @SerializedName("width")
                    var width: Int?
                )

                class Standard(
                    @SerializedName("height")
                    var height: Int?,
                    @SerializedName("url")
                    var url: String?,
                    @SerializedName("width")
                    var width: Int?
                )
            }
        }
    }

    class PageInfo(
        @SerializedName("resultsPerPage")
        var resultsPerPage: Int?,
        @SerializedName("totalResults")
        var totalResults: Int?
    )
}