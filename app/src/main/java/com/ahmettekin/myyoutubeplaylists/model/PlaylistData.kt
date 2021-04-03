package com.ahmettekin.myyoutubeplaylists.model


import com.google.gson.annotations.SerializedName

class PlaylistData(
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
            @SerializedName("localized")
            var localized: Localized?,
            @SerializedName("publishedAt")
            var publishedAt: String?,
            @SerializedName("thumbnails")
            var thumbnails: Thumbnails?,
            @SerializedName("title")
            var title: String?
        ) {
            class Localized(
                @SerializedName("description")
                var description: String?,
                @SerializedName("title")
                var title: String?
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