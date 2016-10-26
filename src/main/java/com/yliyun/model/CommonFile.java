package com.yliyun.model;


/***
 * 公共文件类；
 */
public class CommonFile {

    private Long file_id;
    private Long parent_id;
    private Long fs_file_id;
    private Long trash_id;

    private String parent_ids;
    private Long layer;
    private String file_path;
    private String file_name;
    private Long file_size;
    private String thumb;
    private Long folder;

    private Long doc_type;
    private Long file_version;
    private String file_action;
    private Long del_status;

    private Long creater_id;
    private String creater_name;
    private String create_time;

    private Long update_user_id;
    private String update_user_name;
    private String update_time;

    private Long search_status;


    private Long top_dept_folder;
    private Long dept_id;

    private Long user_id;

    private Long group_id;

    private String file_category;

    private String file_contents;

    public String getFile_contents() {
        return file_contents;
    }

    public void setFile_contents(String file_contents) {
        this.file_contents = file_contents;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public String getFile_category() {
        return file_category;
    }

    public void setFile_category(String file_category) {
        this.file_category = file_category;
    }

    public Long getFile_id() {
        return file_id;
    }

    public void setFile_id(Long file_id) {
        this.file_id = file_id;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public Long getFs_file_id() {
        return fs_file_id;
    }

    public void setFs_file_id(Long fs_file_id) {
        this.fs_file_id = fs_file_id;
    }

    public Long getTrash_id() {
        return trash_id;
    }

    public void setTrash_id(Long trash_id) {
        this.trash_id = trash_id;
    }

    public Long getDept_id() {
        return dept_id;
    }

    public void setDept_id(Long dept_id) {
        this.dept_id = dept_id;
    }

    public String getParent_ids() {
        return parent_ids;
    }

    public void setParent_ids(String parent_ids) {
        this.parent_ids = parent_ids;
    }

    public Long getLayer() {
        return layer;
    }

    public void setLayer(Long layer) {
        this.layer = layer;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public Long getFile_size() {
        return file_size;
    }

    public void setFile_size(Long file_size) {
        this.file_size = file_size;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Long getFolder() {
        return folder;
    }

    public void setFolder(Long folder) {
        this.folder = folder;
    }

    public Long getTop_dept_folder() {
        return top_dept_folder;
    }

    public void setTop_dept_folder(Long top_dept_folder) {
        this.top_dept_folder = top_dept_folder;
    }

    public Long getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(Long doc_type) {
        this.doc_type = doc_type;
    }

    public Long getFile_version() {
        return file_version;
    }

    public void setFile_version(Long file_version) {
        this.file_version = file_version;
    }

    public String getFile_action() {
        return file_action;
    }

    public void setFile_action(String file_action) {
        this.file_action = file_action;
    }

    public Long getDel_status() {
        return del_status;
    }

    public void setDel_status(Long del_status) {
        this.del_status = del_status;
    }

    public Long getCreater_id() {
        return creater_id;
    }

    public void setCreater_id(Long creater_id) {
        this.creater_id = creater_id;
    }

    public String getCreater_name() {
        return creater_name;
    }

    public void setCreater_name(String creater_name) {
        this.creater_name = creater_name;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Long getUpdate_user_id() {
        return update_user_id;
    }

    public void setUpdate_user_id(Long update_user_id) {
        this.update_user_id = update_user_id;
    }

    public String getUpdate_user_name() {
        return update_user_name;
    }

    public void setUpdate_user_name(String update_user_name) {
        this.update_user_name = update_user_name;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Long getSearch_status() {
        return search_status;
    }

    public void setSearch_status(Long search_status) {
        this.search_status = search_status;
    }


    public CommonFile() {

    }

    @Override
    public String toString() {
        return "CommonFile{" +
                "file_id=" + file_id +
                ", parent_id=" + parent_id +
                ", fs_file_id=" + fs_file_id +
                ", trash_id=" + trash_id +
                ", parent_ids='" + parent_ids + '\'' +
                ", layer=" + layer +
                ", file_path='" + file_path + '\'' +
                ", file_name='" + file_name + '\'' +
                ", file_size=" + file_size +
                ", thumb='" + thumb + '\'' +
                ", folder=" + folder +
                ", doc_type=" + doc_type +
                ", file_version=" + file_version +
                ", file_action='" + file_action + '\'' +
                ", del_status=" + del_status +
                ", creater_id=" + creater_id +
                ", creater_name='" + creater_name + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_user_id=" + update_user_id +
                ", update_user_name='" + update_user_name + '\'' +
                ", update_time='" + update_time + '\'' +
                ", search_status=" + search_status +
                ", top_dept_folder=" + top_dept_folder +
                ", dept_id=" + dept_id +
                ", user_id=" + user_id +
                ", group_id=" + group_id +
                ", file_category='" + file_category + '\'' +
                ", file_contents='" + file_contents + '\'' +
                '}';
    }
}
